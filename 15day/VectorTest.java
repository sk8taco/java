package j200207;
//컬렉션의 저장->공통 특징->동적 배열
import java.util.*;//컬렉션,Scanner 

public class VectorTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector v=new Vector();//Vector(1(생성갯수),1(증가치))
         v.add("테스트");//0 v.add(new String("테스트"));
         v.addElement("임시테스트2");//1
         v.add("테스트2");//2
         System.out.println("v의 데이터 저장갯수=>"+v.size());//자동계산
         //값을 출력
         for(int i=0;i<v.size();i++) {
        	 String temp=(String)v.elementAt(i);//elementAt(인덱스번호)
        	 System.out.println("temp=>"+temp);
         }
         //다양한 값을 저장=>크기가 자동으로 조절
         //Vector<String> v2=new Vector<String>();
         Vector v2=new Vector();
         //char c='a';->객체형
         /*
         Character c=new Character('a');
         v2.add(c);*/
         v2.add('a');//v2.add(new Character('a'));//0
         // 3.131592
         v2.add(100);//v2.add(new Integer(100));//1->2
         v2.insertElementAt(3.141592,1);//1.저장할객체명 2.삽입할 인덱스번호
         //잘못 저장,수정할 목적->setElementAt(수정할객체명,수정할 인덱스번호)
         v2.setElementAt("Set", 2);//100->"Set"
         //출력
         for(int i=0;i<v2.size();i++) {
        	 System.out.println("v2의 값=>"+v2.elementAt(i));//Character
        	 //꺼내올때 자동으로 형변환이 되면서 출력하고자하는 경우
         }
	}

}








