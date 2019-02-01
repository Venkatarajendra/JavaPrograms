package collectionsPkg;

public class EmpClass implements Comparable<EmpClass> {
	String ename;
	int eno;
	
	public EmpClass(String ename, int eno) {
		this.ename = ename;
		this.eno = eno;
	}	

	public String toString() {
		return ename+" : "+eno;
	}

	@Override
	public int compareTo(EmpClass e) {
		if(this.eno<e.eno) {
			return -1;
		}
		else if(this.eno>e.eno) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
	
	
}
