package j200207;

//데이터를 저장(1.문자열 저장->2.자료형에 맞게 저장->3.객체자체(멤버변수)를 파일로 저장
//                                                                ObjectInputStream,ObjectOutputStream
import java.io.*;

class Person implements Serializable{  //직렬화가 가능한 클래스->스프링
	String name;
	int age;
	transient String addr;//transient 멤버변수=>파일로 저장이 안된다.
}
public class ObjectTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        Person p=new Person();
        p.name="홍길동";
        p.age=34;
        p.addr="경기도 광명시 ~";
        
        //1.파일로 저장->FileOutputStream
        FileOutputStream fos=new FileOutputStream
        		                     ("c:/webtest/3.java/object.txt");
        //2.객체만 저장이 가능하도록(다리 클래스)
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //~.writeBytest("홍길동");~.writeInt(34)~writeBytest("경기도~")
        //oos.writeObject(t1);//Car
        oos.writeObject(p);//Object=>모든 객체다 저장이 가능하게 만들어져있다.
                                     //객체자동형변환->Person->Object형으로 변경돼서 저장
        oos.close();
        fos.close();
        //만들어진 파일의 내용을 다시 읽어들여서 확인후 출력(객체의 값 확인)=>역직렬화
        ObjectInputStream ois=new ObjectInputStream
        		(new FileInputStream("c:/webtest/3.java/object.txt"));
        //집에 있는 컴퓨터에 연결<->readObject()->Object형
        //객체 명시적인 형변환이 필요->Object->Person형으로 변경
        Person p2=(Person)ois.readObject();
        //Car t2=(Car)ois.readObject();
        System.out.println("이름="+p2.name+",나이="+p2.age+",주소=>"+p2.addr);
        
	}

}




