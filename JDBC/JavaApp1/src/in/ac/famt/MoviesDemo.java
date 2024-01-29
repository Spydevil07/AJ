package in.ac.famt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoviesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Appctx.xml");
		Movies m1 = new Movies(2,"XYZ","ABC");
		MoviesDAOSelect md = (MoviesDAOSelect) ctx.getBean("movieBean1");
		int count = md.saveMovies(m1);
		if(count==1) {
			System.out.println("record inserted");
		}
		else {
			System.out.println("not inserted ");
		}
		md.getallMoviesList();
		md.getSingleRecordofMovie();
	}

}
