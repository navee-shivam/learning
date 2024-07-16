package com.citi;

public class TurnDie {

	public static int solution(int[] A) {
		int totalDice = A.length;
		int minCount = Integer.MAX_VALUE;

		for (int count = 0; count < totalDice; count++) {

			int totalMove = 0;
			int targetPip = A[count];

			for (int othersCount = 0; othersCount < totalDice; othersCount++) {
				if (othersCount == count)
					continue;

				int presentPip = A[othersCount];

				if (targetPip != presentPip)
					totalMove++;
				if ((targetPip + presentPip) == 7)
					totalMove++;
			}

			if (minCount > totalMove)
				minCount = totalMove;
		}
		return minCount;
	}

	public static void main(String... args) {
		System.out.println(solution(new int[] { 1, 2, 3 }));
		System.out.println(solution(new int[] { 1, 1, 6 }));
		System.out.println(solution(new int[] { 1, 6, 2, 3 }));
		System.out.println(solution(new int[] { 1, 5, 6, 2, 3, 2, 4 }));
	}

}
