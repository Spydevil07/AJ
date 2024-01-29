package in.ac.famt;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class MoviesDAOSelect {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveMovies(Movies m1) {
		String sqlstr="INSERT INTO mymovies VALUES (" + m1.getMovid() +",'" + m1.getTitle()+ "','" + m1.getActor() + "')";
		return jdbcTemplate.update(sqlstr);
	}
	
	public void getallMoviesList() {
		String sqlstr = "Select * from mymovies";
		System.out.println(jdbcTemplate.queryForList(sqlstr));
	}
	
	public void getSingleRecordofMovie() {
		String sqlstr = "SELECT * from mymovies";
		List<Map<String,Object>> movList = jdbcTemplate.queryForList(sqlstr);
		movList.forEach((movElt)->
		{
			int mid = (int)movElt.get("movid");
			String mt = (String)movElt.get("title");
			String act = (String)movElt.get("actor");
			Movies movie = new Movies(mid,mt,act);
			System.out.println("Movie-"+movie);
		});
		
	}

}
