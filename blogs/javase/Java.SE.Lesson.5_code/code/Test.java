public class Test
{
	public boolean canAccess(int access)
	{
		if(access == Authorization.MANAGER)
		{
			return true; //�������Ȩ��
		}
		if(access == Authorization.DEPARTMENT)
		{
			return false; //���ž������Ȩ��
		}
		if(access == Authorization.EMPLOYEE)
		{
			return false; //��ͨԱ������Ȩ��
		}

		return false;
	}
}
