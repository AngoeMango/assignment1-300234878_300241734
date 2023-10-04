package design5;

import java.util.Random;

public class TestRunTime5 {
	public long testConstructorCP3() {
		long start = System.currentTimeMillis();
		PointCP5 point = new PointCP3(1, 1);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testConstructorCP2() {
		long start = System.currentTimeMillis();
		PointCP5 point = new PointCP2(1, 1);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetX(PointCP5 point) {
		long start = System.currentTimeMillis();
		point.getX();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetY(PointCP5 point) {
		long start = System.currentTimeMillis();
		point.getY();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetRho(PointCP5 point) {
		long start = System.currentTimeMillis();
		point.getRho();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testGetTheta(PointCP5 point) {
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
	
	public long testConvertStorageToCartesian(PointCP2 point)
    {
		long start = System.currentTimeMillis();
		point.convertStorageToCartesian();
		long finish = System.currentTimeMillis();
		return finish - start;
    }
	
	public long testGetDistance(PointCP5 point1, PointCP5 point2) {
		long start = System.currentTimeMillis();
		point1.getDistance(point2);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testRotatePoint(PointCP5 point, double rotation) {
		long start = System.currentTimeMillis();
		point.rotatePoint(rotation);
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public long testToString(PointCP5 point) {
		long start = System.currentTimeMillis();
		point.toString();
		long finish = System.currentTimeMillis();
		return finish - start;
	}
	
	public static void main(String[] args) {
		TestRunTime5 t = new TestRunTime5();
		Random r = new Random();
		long[] times = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < 100000000; i ++) {
			PointCP5 pointCP3 = new PointCP3(r.nextDouble(), r.nextDouble());
			PointCP5 pointCP2 = new PointCP2(r.nextDouble(), r.nextDouble());
			PointCP2 point2 = new PointCP2(r.nextDouble(), r.nextDouble());
			PointCP3 point3 = new PointCP3(r.nextDouble(), r.nextDouble());
			double rotation = r.nextDouble();
			times[0] += t.testConstructorCP2();
			times[1] += t.testGetX(pointCP2);
			times[2] += t.testGetY(pointCP2);
			times[3] += t.testGetRho(pointCP2);
			times[4] += t.testGetTheta(pointCP2);
			times[5] += t.testConvertStorageToCartesian(point2);
			times[6] += t.testGetDistance(pointCP2, point2);
			times[7] += t.testRotatePoint(pointCP2, rotation);
			times[8] += t.testToString(pointCP2);
			
			times[9] += t.testConstructorCP3();
			times[10] += t.testGetX(pointCP3);
			times[11] += t.testGetY(pointCP3);
			times[12] += t.testGetRho(pointCP3);
			times[13] += t.testGetTheta(pointCP3);
			times[14] += t.testConvertStorageToPolar(point3);
			times[15] += t.testGetDistance(pointCP3, point3);
			times[16] += t.testRotatePoint(pointCP3, rotation);
			times[17] += t.testToString(pointCP3);
		}
		for (int j = 0; j < 18; j ++) {
			System.out.println(times[j]);
		}
		
	}
}