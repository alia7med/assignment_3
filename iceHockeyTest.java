package Testing;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.awt.Point;

class iceHockeyTest {

	@Test
	void test1() {
		Classes.iceHockey obj = new Classes.iceHockey();
		String[] photo = {
				};
		assertArrayEquals(null,obj.findPlayers(photo, 3, 4));
	}
	@Test
	void test2(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"33JUBU33",
				"3U3O4433",
				"O33P44NB",
				"PO3NSDP3",
				"VNDSD333",
				"OINFD33X"
		};
		Point[] res = {
				new Point(4,5),
				new Point (13,9),
				new Point(14,2)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 3, 16));
	}
	@Test
	void test3(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"44444H44S4",
				"K444K4L444",
				"4LJ44T44XH",
				"444O4VIF44",
				"44C4D4U444",
				"4V4Y4KB4M4",
				"G4W4HP4O4W",
				"4444ZDQ4S4",
				"4BR4Y4A444",
				"4G4V4T4444"
		};
		Point[] res = {
				new Point(3,8),
				new Point (4,16),
				new Point(5,4),
				new Point (16,3),
				new Point  (16,17),
				new Point (17,9)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 4, 16));
	}
	@Test
	void test4(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"8D88888J8L8E888",
				"88NKMG8N8E8JI88",
				"888NS8EU88HN8EO",
				"LUQ888A8TH8OIH8",
				"888QJ88R8SG88TY",
				"88ZQV88B88OUZ8O",
				"FQ88WF8Q8GG88B8",
				"8S888HGSB8FT8S8",
				"8MX88D88888T8K8",
				"8S8A88MGVDG8XK8",
				"M88S8B8I8M88J8N",
				"8W88X88ZT8KA8I8",
				"88SQGB8I8J88W88",
				"U88H8NI8CZB88B8",
				"8PK8H8T8888TQR8"

		};
		Point[] res = {
				new Point(1, 17),
				new Point  (3, 3),
				new Point (3, 10),
				new Point  (3, 25),
				new Point  (5, 21),
				new Point  (8, 17),
				new Point(9, 2),
				new Point  (10,9),
				new Point  (12,23),
				new Point  (17,16),
				new Point   (18,3),
				new Point  (18,11),
				new Point (18,28),
				new Point  (22,20),
				new Point (23,26),
				new Point  (24,15),
				new Point (27,2),
				new Point  (28,26),
				new Point  (29,16)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 8, 9));
	}
	@Test
	void test5(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"11111",
				"1AAA1",
				"1A1A1",
				"1AAA1",
				"11111"
		};
		Point[] res = {
				new Point(5, 5),
				new Point  (5, 5)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 1, 3));
	}
	@Test
	void test6(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"1",
		};
		Point[] res = {
				new Point(1, 1)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 1, 3));
	}
	@Test
	void test7(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"1FKFLGJKGK",
				"A1DFRJKLEK",
				"BA1GLKHITF",
				"LLP1ADEQWR",
				"POUT1BNBLK",
				",MBQE1POGA",
				"AVMNRE1POI",
				"AMEQEEE1PO",
				"DASDFQER1E",
				"FLKGLKGGG1"
		};
		Point[] res = {
				new Point(1, 1),
				new Point(3,3),
				new Point(5,5),
				new Point (7,7),
				new Point (9,9),
				new Point(11, 11),
				new Point(13,13),
				new Point(15,15),
				new Point (17,17),
				new Point (19,19)
		};
		assertArrayEquals(res,obj.findPlayers(photo, 1, 3));
	}
	@Test
	void test8(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"ABAEQEFAF",
				"LKEQPKLKK",
				"ROPIROQRI",
				"RKGJSLGKJ"
		};
		
		assertArrayEquals(null,obj.findPlayers(photo, 2, 6));
	}
	@Test
	void test9(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"33JUBU33",
				"3U3O4433",
				"O33P4BNB",
				"PO3NSDP3",
				"VNDSD333",
				"OINFD33X"
		};
		
		
		assertArrayEquals(null,obj.findPlayers(photo, 4, 16));
	}
	@Test
	void test10(){
		Classes.iceHockey obj = new Classes.iceHockey();

		String[] photo = {
				"111AAAA",
				"1111AAA",
				"11111AA"
		};
	
		
		assertArrayEquals(null,obj.findPlayers(photo, 2, 16));
	}
	

}
