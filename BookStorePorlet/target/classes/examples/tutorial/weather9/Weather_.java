package examples.tutorial.weather9;
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
public class Weather_ {
private static final ControllerMethod method_0 = new ControllerMethod(null,Phase.RENDER,examples.tutorial.weather9.Weather.class,Tools.safeGetMethod(examples.tutorial.weather9.Weather.class,"index"), Arrays.<ControllerParameter>asList());
public static Update index() { return ((ActionContext)Request.getCurrent().getContext()).createResponse(method_0); }
public static URLBuilder indexURL() { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_0); }
private static final ControllerMethod method_1 = new ControllerMethod(null,Phase.RESOURCE,examples.tutorial.weather9.Weather.class,Tools.safeGetMethod(examples.tutorial.weather9.Weather.class,"getFragment",java.lang.String.class), Arrays.<ControllerParameter>asList(new ControllerParameter("location",Cardinality.SINGLE,null,java.lang.String.class)));
public static URLBuilder getFragmentURL(java.lang.String location) { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_1,(Object)location); }
private static final ControllerMethod method_2 = new ControllerMethod(null,Phase.ACTION,examples.tutorial.weather9.Weather.class,Tools.safeGetMethod(examples.tutorial.weather9.Weather.class,"add",java.lang.String.class), Arrays.<ControllerParameter>asList(new ControllerParameter("location",Cardinality.SINGLE,null,java.lang.String.class)));
public static URLBuilder addURL(java.lang.String location) { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_2,(Object)location); }
private static final ControllerMethod method_3 = new ControllerMethod(null,Phase.ACTION,examples.tutorial.weather9.Weather.class,Tools.safeGetMethod(examples.tutorial.weather9.Weather.class,"updateGrade",java.lang.String.class,java.lang.String.class), Arrays.<ControllerParameter>asList(new ControllerParameter("grade",Cardinality.SINGLE,null,java.lang.String.class),new ControllerParameter("location",Cardinality.SINGLE,null,java.lang.String.class)));
public static URLBuilder updateGradeURL(java.lang.String grade,java.lang.String location) { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_3,new Object[]{grade,location}); }
private static final ControllerMethod method_4 = new ControllerMethod(null,Phase.RENDER,examples.tutorial.weather9.Weather.class,Tools.safeGetMethod(examples.tutorial.weather9.Weather.class,"index",java.lang.String.class), Arrays.<ControllerParameter>asList(new ControllerParameter("location",Cardinality.SINGLE,null,java.lang.String.class)));
public static Update index(java.lang.String location) { return ((ActionContext)Request.getCurrent().getContext()).createResponse(method_4,(Object)location); }
public static URLBuilder indexURL(java.lang.String location) { return ((MimeContext)Request.getCurrent().getContext()).createURLBuilder(method_4,(Object)location); }
public static final ControllerBean DESCRIPTOR = new ControllerBean(Weather.class,Arrays.<ControllerMethod>asList(method_0,method_1,method_2,method_3,method_4));
}
