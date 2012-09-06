; def closure0 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure0,["name":"location".toString()]);;out.print(Constants.s0);
; def closure1 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure1,["name":"temperature".toString()]);;out.print(Constants.s1);
; def closure2 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure2,["name":"locations".toString()]);;out.print(Constants.s2);
; def closure3 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure3,["name":"grade".toString()]);;out.print(Constants.s3);
;out.print(examples.tutorial.weather9.Weather_.addURL(null));;out.print(Constants.s4);
;out.print("${grade=='c'?'btn-inverse':''}");
;out.print(Constants.s5);
;out.print(examples.tutorial.weather9.Weather_.updateGradeURL('c',location));;out.print(Constants.s6);
;out.print("${grade=='f'?'btn-inverse':''}");
;out.print(Constants.s7);
;out.print(examples.tutorial.weather9.Weather_.updateGradeURL('f',location));;out.print(Constants.s8);
 def id = Math.abs(new java.util.Random().nextInt()); 
;out.print(Constants.s9);
;out.print("${id}");
;out.print(Constants.s10);
 def index = locations.indexOf(location);
    index = index == -1 ? 0 : index;
    locations.eachWithIndex() { current, i -> 
;out.print(Constants.s11);
;out.print("${current}");
;out.print(Constants.s12);
;out.print("${id}");
;out.print(Constants.s13);
;out.print("${current}");
;out.print(Constants.s14);
 def expanded = i != index ? 'in' : ''; 
;out.print(Constants.s15);
;out.print("${current}");
;out.print(Constants.s16);
;out.print("${expanded}");
;out.print(Constants.s17);
 } 
;out.print(Constants.s18);

public static class Constants
{
public static final juzu.io.CharArray$Simple s0 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s1 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s2 = new juzu.io.CharArray$Simple('\n');
public static final juzu.io.CharArray$Simple s3 = new juzu.io.CharArray$Simple('\n\n<div class="tutorial" style="padding: 10px">\n\n  <div>\n  	\n	\n    <form action="');
public static final juzu.io.CharArray$Simple s4 = new juzu.io.CharArray$Simple('" method="post" style="float:left">\n      <fieldset>\n        <div class="controls">\n          <div class="input-append">\n            <input class="span2" type="text" size="16" name="location" value=""/>\n            <button type="submit" class="btn">Add</button>\n          </div>\n        </div>\n      </fieldset>\n    </form>\n\n    <div class="btn-group" style="float:right">\n      <a class="btn ');
public static final juzu.io.CharArray$Simple s5 = new juzu.io.CharArray$Simple('" href="');
public static final juzu.io.CharArray$Simple s6 = new juzu.io.CharArray$Simple('">C</a>\n      <a class="btn ');
public static final juzu.io.CharArray$Simple s7 = new juzu.io.CharArray$Simple('" href="');
public static final juzu.io.CharArray$Simple s8 = new juzu.io.CharArray$Simple('">F</a>\n    </div>\n\n    <div style="clear:both"/>\n\n  </div>\n\n  ');
public static final juzu.io.CharArray$Simple s9 = new juzu.io.CharArray$Simple('\n  <div id="');
public static final juzu.io.CharArray$Simple s10 = new juzu.io.CharArray$Simple('" class="accordion">\n\n    ');
public static final juzu.io.CharArray$Simple s11 = new juzu.io.CharArray$Simple('\n    <div class="accordion-group">\n      <div class="accordion-heading">\n        <a class="accordion-toggle" href="#');
public static final juzu.io.CharArray$Simple s12 = new juzu.io.CharArray$Simple('" data-parent="');
public static final juzu.io.CharArray$Simple s13 = new juzu.io.CharArray$Simple('" data-toggle="collapse">');
public static final juzu.io.CharArray$Simple s14 = new juzu.io.CharArray$Simple('</a>\n      </div>\n      ');
public static final juzu.io.CharArray$Simple s15 = new juzu.io.CharArray$Simple('\n      <div id="');
public static final juzu.io.CharArray$Simple s16 = new juzu.io.CharArray$Simple('" class="accordion-body collapse ');
public static final juzu.io.CharArray$Simple s17 = new juzu.io.CharArray$Simple('">\n        <div class="accordion-inner">\n        </div>\n      </div>\n    </div>\n    ');
public static final juzu.io.CharArray$Simple s18 = new juzu.io.CharArray$Simple('\n\n  </div>\n\n</div>');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
32:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(5,47),' } '),
6:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(21,23),'grade==\'c\'?\'btn-inverse\':\'\''),
9:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(21,24),'grade==\'f\'?\'btn-inverse\':\'\''),
12:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(3,31),' def id = Math.abs(new java.util.Random().nextInt()); '),
14:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(12,32),'id'),
17:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(1,35),'    index = index == -1 ? 0 : index;'),
16:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(5,34),' def index = locations.indexOf(location);'),
18:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(1,36),'    locations.eachWithIndex() { current, i -> '),
20:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(44,39),'current'),
22:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(69,39),'id'),
24:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(99,39),'current'),
26:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(7,41),' def expanded = i != index ? \'in\' : \'\'; '),
28:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(16,42),'current'),
30:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(59,42),'expanded')];
}
