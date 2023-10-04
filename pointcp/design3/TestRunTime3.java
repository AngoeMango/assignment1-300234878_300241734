package design3;

import java.util.Random;

public class TestRunTime3 {
	public long testConstructor() {
		long start = System.currentTimeMillis();
		PointCP3 point = new PointCP3(1, 1);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetX(PointCP3 point) {
		long start = System.currentTimeMillis();
		point.getX();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetY(PointCP3 point) {
		long start = System.currentTimeMillis();
		point.getY();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetRho(PointCP3 point) {
		long start = System.currentTimeMillis();
		point.getRho();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetTheta(PointCP3 point) {
		long start = System.currentTimeMillis();
		point.getTheta();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testConvertStorageToPolar(PointCP3 point)
    {
		long start = System.currentTimeMillis();
		point.convertStorageToPolar();
		long finish = System.currentTimeMillis();
		return finish - start;
    }
	
	public long testGetDistance(PointCP3 point1, PointCP3 point2) {
		long start = System.currentTimeMillis();
		point1.getDistance(point2);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testRotatePoint(PointCP3 point, double rotation) {
		long start = System.currentTimeMillis();
		point.rotatePoint(rotation);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testToString(PointCP3 point) {
		long start = System.currentTimeMillis();
		point.toString();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public static void main(String[] args) {
		TestRunTime3 t = new TestRunTime3();
		Random r = new Random();
		long[] times = {0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < 100000000; i ++) {
			PointCP3 point = new PointCP3(r.nextDouble(), r.nextDouble());
			PointCP3 point2 = new PointCP3(r.nextDouble(), r.nextDouble());
			double rotation = r.nextDouble();
			times[0] += t.testConstructor();
			times[1] += t.testGetX(point);
			times[2] += t.testGetY(point);
			times[3] += t.testGetRho(point);
			times[4] += t.testGetTheta(point);
			times[5] += t.testConvertStorageToPolar(point);
			times[6] += t.testGetDistance(point, point2);
			times[7] += t.testRotatePoint(point, rotation);
			times[8] += t.testToString(point);
		}
		for (int j = 0; j < 9; j ++) {
			System.out.println(times[j]);
		}
		
	}
}