package java_15;
import java.util.*;

public class Emploi implements Comparable<Emploi>{
	 String name;
	 int e_id;
	 int age;
	 int e_salary;
	Emploi(String name,int e_id,int age,int e_salary){
		this.name=name;
		this.e_id=e_id;
		this.age=age;
		this.e_salary=e_salary;=
	}
	public int compareTo(Emploi o) {
		if(e_salary==o.e_salary)
			return 0;
		else if(e_salary>o.e_salary)
			return 1;
		else 
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emploi> num=new ArrayList<>();
		num.add(new Emploi("rishi",101,24,29000));
		num.add(new Emploi("nitin",102,27,25000));
		num.add(new Emploi("mansi",103,33,89000));
		num.add(new Emploi("kartik",103,30,75000));
		Collections.sort(num);
		for(Emploi E1:num) {
			System.out.println("name"+" "+E1.name+"id"+" "+E1.e_id+"age"+" "+E1.age+"salary"+" "+E1.e_salary );
		}
		

	}

}
