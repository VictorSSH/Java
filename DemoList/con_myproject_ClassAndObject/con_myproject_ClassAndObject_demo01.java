package con_myproject_ClassAndObject;

class Book { 							// ����һ���µ���
    private String title; 					// �������
    private double price; 					// ��ļ۸�
    /**
     * Book�๹�췽������������title��price���Ե�����
     * @param t title��������
     * @param p price��������
     */
    public Book(String t,double p) {				// ���幹�췽��
        setTitle(t) ;							// ���ñ��෽��
        setPrice(p) ;							// ���ñ��෽��
    }
    public void setTitle(String t) {				// ����title��������
        title = t;
    }
    public void setPrice(double p) {				// ����price��������
        price = p ;
    }
    public String getTitle() {					// ȡ��title��������
        return title;
    }
    public double getPrice() {					// ȡ��price��������
        return price;
    }
    public void getInfo() { 						// �˷������ɶ������
        System.out.println("ͼ�����ƣ�" + title + "���۸�" + price);
    }
}

public class con_myproject_ClassAndObject_demo01 {
	 
	    public static void main(String[] beijing) {
	        Book book = new Book("Java����", 69.8); 	// ������ʵ��������
	        book.getInfo();						// ���÷���
	    }
	}

