package con_myproject_ClassAndObject;

class Book { 							// 定义一个新的类
    private String title; 					// 书的名字
    private double price; 					// 书的价格
    /**
     * Book类构造方法，用于设置title与price属性的内容
     * @param t title属性内容
     * @param p price属性内容
     */
    public Book(String t,double p) {				// 定义构造方法
        setTitle(t) ;							// 调用本类方法
        setPrice(p) ;							// 调用本类方法
    }
    public void setTitle(String t) {				// 设置title属性内容
        title = t;
    }
    public void setPrice(double p) {				// 设置price属性内容
        price = p ;
    }
    public String getTitle() {					// 取得title属性内容
        return title;
    }
    public double getPrice() {					// 取得price属性内容
        return price;
    }
    public void getInfo() { 						// 此方法将由对象调用
        System.out.println("图书名称：" + title + "，价格：" + price);
    }
}

public class con_myproject_ClassAndObject_demo01 {
	 
	    public static void main(String[] beijing) {
	        Book book = new Book("Java开发", 69.8); 	// 声明并实例化对象
	        book.getInfo();						// 调用方法
	    }
	}

