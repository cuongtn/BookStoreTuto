/*
 * Copyright (C) 2011 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package examples.tutorial.weather3;

import juzu.Path;
import juzu.View;
import juzu.template.Template;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class Weather {

  @Inject
  WeatherService weatherService;

  @Inject
  @Path("index.gtmpl")
  Template index;

  @View
  public void index() {
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("location", "Marseille");
    parameters.put("temperature", weatherService.getTemperature("marseille"));
    index.render(parameters);
  }
}
