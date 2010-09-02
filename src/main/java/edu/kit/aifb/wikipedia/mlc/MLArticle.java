package edu.kit.aifb.wikipedia.mlc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class MLArticle extends AbstractMLConcept {

	public MLArticle( MLCFactory factory, int id ) {
		super( factory, id, factory.getArticleTable() );
	}
	
	public Collection<MLCategory> getCategories() throws SQLException {
		PreparedStatement pst = factory.getJdbcStatementBuffer().getPreparedStatement(
				"select mlcl_to from "
				+ factory.getCategorylinksTable()
				+ " where mlcl_namespace=0 and mlcl_from=?;" );
		pst.setInt( 1, id );
		
		Collection<MLCategory> categories = new ArrayList<MLCategory>();
		ResultSet rs = pst.executeQuery();
		while( rs.next() ) {
			categories.add( factory.createMLCategory( rs.getInt( 1 ) ) );
		}
		return categories;
	}

}
