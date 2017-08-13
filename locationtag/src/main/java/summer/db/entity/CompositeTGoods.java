package summer.db.entity;

import java.util.ArrayList;
import java.util.List;

public class CompositeTGoods {
   private String id;
   private String name;
   private String remark;
   private List<String> idfloor;
   private String idtag;
   private List<String> idcompany;
   private List<String> idcategory;
   private Boolean deleteFlag;

   private String floorname;
   private String categoryname;
   private String companyname;
   
   private String orderBy;
   
   public CompositeTGoods() {
	   id = "%";
	   name = "%";
	   remark = "%";
	   idfloor = new ArrayList<>();
	   idtag = "%";
	   idcompany = new ArrayList<>();
	   idcategory = new ArrayList<>();
	   floorname = "%";
	   categoryname = "%";
	   companyname = "%";
	   deleteFlag = false;
	   orderBy = "name DESC";
   }
   	public String getOrderBy() {
	return orderBy;
	}
	
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
   	public Boolean getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIdtag() {
		return idtag;
	}
	public void setIdtag(String idtag) {
		this.idtag = idtag;
	}

	public List<String> getIdfloor() {
		return idfloor;
	}

	public void setIdfloor(List<String> idfloor) {
		this.idfloor = idfloor;
	}

	public List<String> getIdcompany() {
		return idcompany;
	}

	public void setIdcompany(List<String> idcompany) {
		this.idcompany = idcompany;
	}

	public List<String> getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(List<String> idcategory) {
		this.idcategory = idcategory;
	}

	public String getFloorname() {
		return floorname;
	}
	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}
