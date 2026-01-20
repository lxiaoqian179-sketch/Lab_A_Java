package lab_A;
//建立一個固定大小的執行緒池（3條執行緒），同時執行三個 Callable 任務，
//等待全部完成後，依任務提交順序，取得回傳結果，最後正常關閉執行緒池。

//換句話說：這是一個「同步收集多個並行任務結果」的標準範例。


import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Brad23 {
	public static void main(String[] args)throws Exception {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		List<Callable<String>> tasks = List.of(
				() -> "A",
				() -> {Thread.sleep(1000); return "B";},
				() ->"C"
		);
		
		List<Future<String>> futures = pool.invokeAll(tasks);
		
		for (Future<String> f: futures) {
			System.out.println(f.get());
		}
		
		pool.shutdown();
		System.out.println("Main Finish");

	}

}
