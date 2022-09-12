class MSTD {
	public static void main(String args[]) {
		// Calculate mean
		double[] studentMarks = { 50, 10, 45, 70, 65, 80, 82, 90, 100, 78, 50, 10, 45, 70, 65, 80, 82, 90, 100, 78, 98,
				65, 78, 89, 85 };
		int numStudents = 25;
		double sum = 0;
		double mean;

		for (int i = 0; i < numStudents; i++) {
			sum += studentMarks[i];
		}

		mean = sum / numStudents;

		System.out.println("Mean :" + mean);

		// Calculate std
		sum = 0;

		for (int i = 0; i < numStudents; i++) {
			double subMean = studentMarks[i] - mean;
			double toSquare = subMean * subMean;
			sum += toSquare;
		}
		mean = sum / numStudents;

		double deviation = Math.sqrt(mean);
		System.out.println("standard deviation :" + deviation);

	}
}