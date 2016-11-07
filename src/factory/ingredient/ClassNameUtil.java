package factory.ingredient;

public final class ClassNameUtil {


	public static String getClassName(final Object o){
		String clazzName = o.getClass().getName();  
        return clazzName.substring(0, clazzName.lastIndexOf('$'));
	}
}
