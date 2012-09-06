package examples.tutorial.weather9.templates;
import juzu.Path;
import juzu.impl.inject.Export;
import javax.annotation.Generated;
import juzu.impl.template.metadata.TemplateDescriptor;
import javax.inject.Inject;
import juzu.impl.template.TemplatePlugin;
@Generated({})
@Export
@Path("index.gtmpl")
public class index extends juzu.template.Template
{
@Inject
public index(TemplatePlugin templatePlugin)
{
super(templatePlugin, "index.gtmpl");
}
public static final TemplateDescriptor DESCRIPTOR = new TemplateDescriptor(examples.tutorial.weather9.templates.index.class);
public Builder with() {
return new Builder();
}
public class Builder extends juzu.template.Template.Builder
{
public Builder location(Object location) {
set("location",location);
return this;
}
public Builder temperature(Object temperature) {
set("temperature",temperature);
return this;
}
public Builder locations(Object locations) {
set("locations",locations);
return this;
}
public Builder grade(Object grade) {
set("grade",grade);
return this;
}
}
}
