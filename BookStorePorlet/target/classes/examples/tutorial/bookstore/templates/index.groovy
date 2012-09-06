; def closure0 = { ; } as juzu.template.Renderable;; new juzu.impl.tags.ParamTag().render(out.renderContext, closure0,["name":"listBooks".toString()]);;out.print(Constants.s0);
listBooks.each(){book->
;out.print(Constants.s1);
;out.print("${book.name}");
;out.print(Constants.s2);
;out.print("${book.categorie.toString()}");
;out.print(Constants.s3);
;out.print("${book.content}");
;out.print(Constants.s4);
}
;out.print(Constants.s5);

public static class Constants
{
public static final juzu.io.CharArray$Simple s0 = new juzu.io.CharArray$Simple('\n\n<div class="tutorial" style="padding: 10px">\n<table border="1" cellspacing="3">\n	<tr>\n       <th>Name</th>\n       <th>Categorie</th>\n       <th>Content</th>\n   	</tr>\n	');
public static final juzu.io.CharArray$Simple s1 = new juzu.io.CharArray$Simple('\n	\n   <tr>\n       <td>');
public static final juzu.io.CharArray$Simple s2 = new juzu.io.CharArray$Simple('</td>\n       <td>');
public static final juzu.io.CharArray$Simple s3 = new juzu.io.CharArray$Simple('</td>\n       <td>');
public static final juzu.io.CharArray$Simple s4 = new juzu.io.CharArray$Simple('</td>\n   </tr>\n   ');
public static final juzu.io.CharArray$Simple s5 = new juzu.io.CharArray$Simple('\n</table>\n   \n\n   \n</div>');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
2:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(9,10),'listBooks.each(){book->'),
4:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(12,13),'book.name'),
6:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(12,14),'book.categorie.toString()'),
8:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(12,15),'book.content'),
10:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.utils.Location(4,17),'}')];
}
