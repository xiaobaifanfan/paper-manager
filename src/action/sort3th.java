package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Paper;
import service.ConnectSQL;

public class sort3th {
	public  int thirdID;
	public  int secondID;
	public  int firstID;
	public  Paper paper;
public int getSecondID() {
		return secondID;
	}
	public void setSecondID(int secondID) {
		this.secondID = secondID;
	}
	public int getFirstID() {
		return firstID;
	}
	public void setFirstID(int firstID) {
		this.firstID = firstID;
	}
public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
public int getThirdID() {
		return thirdID;
	}
	public void setThirdID(int thirdID) {
		this.thirdID = thirdID;
	}
public List<Paper> result;
public List<Paper> getResult() {
	return result;
}
public void setResult(List<Paper> result) {
	this.result = result;
}
//������ѯ
public String findsort3th() {
	System.out.println(getThirdID());
	Connection conn=ConnectSQL.getConn();
	String sql="select * from paper where sortID="+getThirdID();
	PreparedStatement pst = null;
	result = new ArrayList<>();
	try {
		pst= (PreparedStatement)conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery(sql);
		while(rs.next()) {
			Paper temp = new Paper();
			temp.setPaperID(rs.getString(1));
			temp.setTitle(rs.getString(2));
			temp.setAuthor(rs.getString(3));
			temp.setDate(rs.getString(5));
			temp.setKeyword(rs.getString(9));
			temp.setPublication(rs.getString(7));
			result.add(temp);		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(Paper t:result) {
		System.out.println(t.getDate());
	}
	return "success";
}
//������ѯ
public String findsort2th() {
	System.out.println(getSecondID());
	Connection conn=ConnectSQL.getConn();
	String sql="select * from paper,third where third.upper="+getSecondID()+" and paper.sortID=third.thirdID";
	result = new ArrayList<>();
	System.out.println(sql);
	PreparedStatement pst = null;
	try {
		pst= (PreparedStatement)conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery(sql);
		while(rs.next()) {
			Paper temp = new Paper();
			temp.setPaperID(rs.getString(1));
			temp.setTitle(rs.getString(2));
			temp.setAuthor(rs.getString(3));
			temp.setDate(rs.getString(5));
			temp.setKeyword(rs.getString(9));
			temp.setPublication(rs.getString(7));
			result.add(temp);		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(Paper t:result) {
		System.out.println(t.getDate());
	}
	//System.out.println(getSecondID());
	return "success";
}
//һ����ѯ
public String findsort1th() {
	System.out.println(getFirstID());
	Connection conn=ConnectSQL.getConn();
	String sql="select * from paper,third,second where second.upper="+getFirstID()+" and paper.sortID=third.thirdID and third.upper=second.secondID;";
	System.out.println(sql);
	result = new ArrayList<>();
	PreparedStatement pst = null;
	try {
		pst= (PreparedStatement)conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery(sql);
		while(rs.next()) {
			Paper temp = new Paper();
			temp.setPaperID(rs.getString(1));
			temp.setTitle(rs.getString(2));
			temp.setAuthor(rs.getString(3));
			temp.setDate(rs.getString(5));
			temp.setKeyword(rs.getString(9));
			temp.setPublication(rs.getString(7));
			result.add(temp);		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(Paper t:result) {
		System.out.println(t.getDate());
	}
	//System.out.println(getFirstID());
	return "success";
}
}
