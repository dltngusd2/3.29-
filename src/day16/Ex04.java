package day16;

abstract class Abstract{
	   protected int num;
	   public void setNum(int num){
	      this.num=num;
	   }
	   public abstract void combo() ;
	}
	class class01 extends Abstract{
	   public void combo1111() {
	      System.out.println(num+"단 콤보 공격 & 발차기");
	   }
	   public void zzzzz() {}
	   
	   @Override
	   public void combo() {
	      System.out.println(num+"단 콤보 공격 & 발차기");
	   }
	}
	public class Ex04 {
	   public static void main(String[] args) {
	      class01 c =  new class01();
	      c.setNum(5);
	      c.combo();
	   }
	}

