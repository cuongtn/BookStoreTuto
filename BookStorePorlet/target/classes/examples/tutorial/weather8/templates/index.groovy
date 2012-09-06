; def closure0 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure0,["name":"location".toString()]);;out.print(Constants.s0);
; def closure1 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure1,["name":"temperature".toString()]);;out.print(Constants.s1);
; def closure2 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure2,["name":"locations".toString()]);;out.print(Constants.s2);
; def closure3 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure3,["name":"grade".toString()]);;out.print(Constants.s3);
;out.print(examples.tutorial.weather8.Weather_.addURL(null));;out.print(Constants.s4);
;out.print("${grade=='c'?'btn-inverse':''}");
;out.print(Constants.s5);
;out.print(examples.tutorial.weather8.Weather_.updateGradeURL('c',location));;out.print(Constants.s6);
;out.print("${grade=='f'?'btn-inverse':''}");
;out.print(Constants.s7);
;out.print(examples.tutorial.weather8.Weather_.updateGradeURL('f',location));;out.print(Constants.s8);
 locations.each() { current -> 
;out.print(Constants.s9);
;out.print(examples.tutorial.weather8.Weather_.indexURL(current));;out.print(Constants.s10);
;out.print("${current}");
;out.print(Constants.s11);
 if (current == location) { 
;out.print(Constants.s12);
;out.print("${current}");
;out.print(Constants.s13);
;out.print("${temperature}");
;out.print(Constants.s14);
;out.print("${grade.toUpperCase()}");
;out.print(Constants.s15);
 } 
;out.print(Constants.s16);
 } 
;out.print(Constants.s17);

public static class Constants
{
public static final juzu.io.CharArray$Simple s0 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s1 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s2 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s3 = new juzu.io.CharArray$Simple('\n\n<div class="tutorial" style="padding: 10px">\n\n    <div>\n\n        <form action="');
public static final juzu.io.CharArray$Simple s4 = new juzu.io.CharArray$Simple('" method="post" style="float:left">\n           	<p>\n            	<strong>Name:</strong> <input type="text" name="name" size="16" value=""> *\n        	</p>\n        	<p>\n            	<strong>Category:</strong> <input type="text" name="name" size="16" value=""> *\n        	</p>\n        	<p>\n            	<strong>Content:</strong> <input type="text" name="content" size="60" value=""> *\n        	</p>\n        </form>\n\n        <div class="btn-group" style="float:right">\n            <a class="btn ');
public static final juzu.io.CharArray$Simple s5 = new juzu.io.CharArray$Simple('" href="');
public static final juzu.io.CharArray$Simple s6 = new juzu.io.CharArray$Simple('">C</a>\n            <a class="btn ');
public static final juzu.io.CharArray$Simple s7 = new juzu.io.CharArray$Simple('" href="');
public static final juzu.io.CharArray$Simple s8 = new juzu.io.CharArray$Simple('">F</a>\n        </div>\n\n        <div style="clear:both"/>\n\n    </div>\n\n    <div class="accordion">\n\n        ');
public static final juzu.io.CharArray$Simple s9 = new juzu.io.CharArray$Simple('\n        <div class="accordion-group">\n            <div class="accordion-heading"><a class="accordion-toggle" href="');
public static final juzu.io.CharArray$Simple s10 = new juzu.io.CharArray$Simple('">');
public static final juzu.io.CharArray$Simple s11 = new juzu.io.CharArray$Simple('</a></div>\n            ');
public static final juzu.io.CharArray$Simple s12 = new juzu.io.CharArray$Simple('\n            <div class="accordion-body">\n                <div class="accordion-inner">The weather temperature in ');
public static final juzu.io.CharArray$Simple s13 = new juzu.io.CharArray$Simple(' is ');
public static final juzu.io.CharArray$Simple s14 = new juzu.io.CharArray$Simple('&deg; ');
public static final juzu.io.CharArray$Simple s15 = new juzu.io.CharArray$Simple('.</div>\n            </div>\n            ');
public static final juzu.io.CharArray$Simple s16 = new juzu.io.CharArray$Simple('\n        </div>\n        ');
public static final juzu.io.CharArray$Simple s17 = new juzu.io.CharArray$Simple('\n\n    </div>\n\n</div>');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
17:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(13,36),' if (current == location) { '),
19:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(73,38),'current'),
21:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(87,38),'temperature'),
23:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(107,38),'grade.toUpperCase()'),
6:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(27,23),'grade==\'c\'?\'btn-inverse\':\'\''),
25:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(13,40),' } '),
9:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(27,24),'grade==\'f\'?\'btn-inverse\':\'\''),
27:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(9,42),' } '),
12:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(9,33),' locations.each() { current -> '),
15:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(108,35),'current')];
}
