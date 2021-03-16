package level1;

public class Chapter1 {

	public static void main(String[] args) {
		//FourServlet
		public void doget(httpservlet request, httpres response) {
			int num1 = Integer.parseInt.requst.getparameter(num1);
			int num2 = Integer.parseInt.requst.getparameter(num2);
			String op = requste.getParameter(op);
			
			int result = 0;
			
			switch (op) {
			case "+":
				result = nun1+num2
				break;
			case "-":
				
				result = nun1-num2
				break;
			case "*":
				
				result = nun1*num2
				break;
			case "/":
				
				result = nun1/num2
				break;

			default:
				break;
				
				response.setcontentType("text/http;char=utf-8");
				printWrite out = response.getWriter();
				out.print("<http><head><title>사칙연산 프로그램</title></head>");
				out.print("<body><h2>계산환료</h2></h2><body>");
				out.printf("%d %s %d = %d",num1,op,num2,result);
				out.print("<body><body><http>");
				
				
				
			}
			
			
			
			
		}
		
		
	}

}
