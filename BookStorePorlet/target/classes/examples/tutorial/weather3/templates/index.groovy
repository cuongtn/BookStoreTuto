;out.print(Constants.s0);
;out.print("${location}");
;out.print(Constants.s1);
;out.print("${temperature}");
;out.print(Constants.s2);

public static class Constants
{
public static final juzu.io.CharArray$Simple s0 = new juzu.io.CharArray$Simple('Portlet 2\n---------------------------------------------------------------------------------------------------\n<br>\nThe weather temperature in ');
public static final juzu.io.CharArray$Simple s1 = new juzu.io.CharArray$Simple(' is ');
public static final juzu.io.CharArray$Simple s2 = new juzu.io.CharArray$Simple(' degrees.\n<br><br>');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
2:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(28,4),'location'),
4:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(43,4),'temperature')];
}
