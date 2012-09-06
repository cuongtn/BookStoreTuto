package examples.tutorial.bookstore;
import juzu.impl.controller.descriptor.ControllerMethod;
import juzu.impl.controller.descriptor.ControllerParameter;
import juzu.impl.utils.Tools;
import java.util.Arrays;
import juzu.request.Phase;
import juzu.URLBuilder;
import juzu.impl.application.ApplicationContext;
import juzu.request.MimeContext;
import juzu.request.ActionContext;
import juzu.Response.Update;
import juzu.impl.controller.descriptor.ControllerBean;
import javax.annotation.Generated;
import juzu.impl.utils.Cardinality;
import juzu.impl.request.Request;
@Generated(value={})
public class BookStorePorlet_ {
private static final ControllerMethod method_0 = new ControllerMethod(null,Phase.RENDER,examples.tutorial.bookstore.BookStorePorlet.class,Tools.safeGetMethod(examples.tutorial.bookstore.BookStorePorlet.class,"index"), Arrays.<ControllerParameter>asList());
public static Update index() { return ((ActionContext)Request.getCurrent().getContext()).createResponse(method_0); }
public static URLBuilder indexURL() { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_0); }
public static final ControllerBean DESCRIPTOR = new ControllerBean(BookStorePorlet.class,Arrays.<ControllerMethod>asList(method_0));
}
