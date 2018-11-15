package CompilePolyMorphism;

public class TestpolyMorBangla {

	public static void main(String[] args) {
	//Teacher is child class and person is a super/parents class here 
	
		
	//this is the run time polymorphism /dynamic plym 	
		PersionPolyMorBangla p=new PersionPolyMorBangla();
		p.display();
		
		p=new TeacherPolyMorBangla();
		p.display();
		
		p=new StudentpolyMorBangla();
		p.display();
		
	//person is a supar class/parents class	
    //p is a reference of person class so, i can call all the object `s methods by person p referece varialbe 
		
		
		
		
	}

}
