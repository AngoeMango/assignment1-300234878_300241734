package design2;

import java.util.Random;

public class TestRunTime2 {
	public long testConstructor() {
		long start = System.currentTimeMillis();
		PointCP2 point = new PointCP2(1, 1);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetX(PointCP2 point) {
		long start = System.currentTimeMillis();
		point.getX();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetY(PointCP2 point) {
		long start = System.currentTimeMillis();
		point.getY();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetRho(PointCP2 point) {
		long start = System.currentTimeMillis();
		point.getRho();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetTheta(PointCP2 point) {
		long start = System.currentTimeMillis();
		point.getTheta();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testConvertStorageToCartesian(PointCP2 point)
    {
		long start = System.currentTimeMillis();
		point.convertStorageToCartesian();
		long finish = System.currentTimeMillis();
		return finish - start;
    }
	
	public long testGetDistance(PointCP2 point1, PointCP2 point2) {
		long start = System.currentTimeMillis();
		point1.getDistance(point2);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testRotatePoint(PointCP2 point, double rotation) {
		long start = System.currentTimeMillis();
		point.rotatePoint(rotation);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testToString(PointCP2 point) {
		long start = System.currentTimeMillis();
		point.toString();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public static void main(String[] args) {
		TestRunTime2 t = new TestRunTime2();
		Random r = new Random();
		long[] times = {0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < 100000000; i ++) {
			PointCP2 point = new PointCP2(r.nextDouble(), r.nextDouble());
			PointCP2 point2 = new PointCP2(r.nextDouble(), r.nextDouble());
			double rotation = r.nextDouble();
			times[0] += t.testConstructor();
			times[1] += t.testGetX(point);
			times[2] += t.testGetY(point);
			times[3] += t.testGetRho(point);
			times[4] += t.testGetTheta(point);
			times[5] += t.testGetDistance(point, point2);
			times[6] += t.testConvertStorageToCartesian(point);
			times[7] += t.testRotatePoint(point, rotation);
			times[8] += t.testToString(point);
		}
		for (int j = 0; j < 9; j ++) {
			System.out.println(times[j]);
		}
		
	}
}