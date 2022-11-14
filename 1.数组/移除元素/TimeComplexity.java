import java.util.Scanner;

public class TimeComplexity {
// o(n)
public static void function1(long n) {
	System.out.println("o(n)�㷨");
	long k = 0;
	for (long i = 0; i < n; i++) {
		k++;
	}
}

// o(n^2)
public static void function2(long n) {
	System.out.println("o(n^2)�㷨");
	long k = 0;
	for (long i = 0; i < n; i++) {
		for (long j = 0; j < n; j++) {
			k++;
		}
	}
}

// o(nlogn)
public static void function3(long n) {
	System.out.println("o(nlogn)�㷨");
	long k = 0;
	for (long i = 0; i < n; i++) {
		for (long j = 1; j < n; j = j * 2) { // ע������j=1
			k++;
		}
	}
}

public static void main(String[] args) {
	while(true) {
		Scanner in = new Scanner(System.in);
		System.out.print("����n: ");
		int n = in.nextInt();
		long startTime = System.currentTimeMillis();
		
		function1(n);
		// function2(n);
		// function3(n);
		
		long endTime = System.currentTimeMillis();
		long costTime = endTime - startTime;
		System.out.println("�㷨��ʱ == " + costTime + "ms");
	}
}
}