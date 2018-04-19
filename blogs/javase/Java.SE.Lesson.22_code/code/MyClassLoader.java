import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader
{
	private String name; //�������������
	
	private String path = "d:\\"; // �������·��
	
	private final String fileType = ".class"; // class�ļ�����չ��
	
	public MyClassLoader(String name)
	{
		super(); // ��ϵͳ���������Ϊ����������ĸ�������
		
		this.name = name;
	}
	
	public MyClassLoader(ClassLoader parent, String name)
	{
		super(parent); // ��ʽָ������������ĸ�������
		
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}
	
	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException
	{
		byte[] data = this.loadClassData(name);
		
		return this.defineClass(name, data, 0, data.length);
	}
	
	private byte[] loadClassData(String name)
	{
		InputStream is = null;
		byte[] data = null;
		ByteArrayOutputStream baos = null;
		
		try
		{
			this.name = this.name.replace(".", "\\");
			
			is = new FileInputStream(new File(path + name + fileType));
			
			baos = new ByteArrayOutputStream();
			
			int ch = 0;
			
			while(-1 != (ch = is.read()))
			{
				baos.write(ch);
			}
			
			data = baos.toByteArray();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				is.close();
				baos.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		return data;
	}
	
	public static void main(String[] args) throws Exception
	{
		MyClassLoader loader1 = new MyClassLoader("loader1");
		
		loader1.setPath("d:\\myapp\\serverlib\\");
		
		MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
		
		loader2.setPath("d:\\myapp\\clientlib\\");
//		
//		MyClassLoader loader3 = new MyClassLoader(null, "loader3");
//		
//		loader3.setPath("d:\\myapp\\otherlib\\");
//		
//		test(loader2);
//		
//		System.out.println("----------");
//		
//		test(loader3);
		
		Class clazz = loader1.loadClass("Sample");
		Object object = clazz.newInstance(); //����һ��Sample��Ķ���
		Sample sample = (Sample)object;
		
		System.out.println(sample.v1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void test(ClassLoader loader) throws Exception
	{
		Class clazz = loader.loadClass("Sample");
		
		Object object = clazz.newInstance();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}