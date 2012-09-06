; def closure0 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure0,["name":"location".toString()]);;out.print(Constants.s0);
; def closure1 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure1,["name":"temperature".toString()]);;out.print(Constants.s1);
; def closure2 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure2,["name":"grade".toString()]);;out.print(Constants.s2);
;out.print("${location}");
;out.print(Constants.s3);
;out.print("${temperature}");
;out.print(Constants.s4);
;out.print("${grade.toUpperCase()}");
;out.print(Constants.s5);

public static class Constants
{
public static final juzu.io.CharArray$Simple s0 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s1 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s2 = new juzu.io.CharArray$Simple('\nThe weather temperature in ');
public static final juzu.io.CharArray$Simple s3 = new juzu.io.CharArray$Simple(' is ');
public static final juzu.io.CharArray$Simple s4 = new juzu.io.CharArray$Simple('&deg;\n');
public static final juzu.io.CharArray$Simple s5 = new juzu.io.CharArray$Simple('.');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
4:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(28,4),'location'),
6:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(43,4),'temperature'),
8:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(1,5),'grade.toUpperCase()')];
}
