class sggs{
	String clgName;
	sggs (String clgName)
	{
		this.clgName=clgName;
	}
	class department
	{
		String deptName;
		department (String deptName)
		{
			this.deptName=deptName;
		}
	}
	public static void main(String args[]){
	sggs SGGS = new sggs("sggs");
	department It = SGGS.new department("IT");
	System.out.println(It.deptName);
	System.out.println(SGGS.clgName);
	
	}
}
