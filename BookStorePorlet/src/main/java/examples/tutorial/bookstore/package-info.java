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

@Application
@Portlet
@Bindings({
   @Binding(value = org.exoplatform.test.BookStoreServiceImpl.class, implementation = GateInMetaProvider.class),
   @Binding(value = org.exoplatform.test.SimpleServiceImpl.class, implementation = GateInMetaProvider.class)
})
@Assets(
		scripts = {
			    @Script(id = "jquery", src = "jquery-1.7.1.min.js", location = AssetLocation.CLASSPATH),
			    @Script(id = "jquery-ui", src = "jquery-ui-1.8.23.custom.min.js", location = AssetLocation.CLASSPATH, depends = "jquery"),
			    @Script(src = "jquery.jtable.js", location = AssetLocation.CLASSPATH, depends = "jquery-ui"),
			    @Script(src = "bookstore.js", location = AssetLocation.CLASSPATH, depends = "jquery"),
			    @Script(src = "jquery.tools.min.js", location = AssetLocation.CLASSPATH, depends = "jquery"),
			    @Script(src = "/bookStore-gatein/javascripts/popbox.js", depends = "jquery"),
			    @Script(src = "/bookStore-gatein/javascripts/popbox.min.js", depends = "jquery")
		},
		stylesheets = @Stylesheet(src = "/examples/tutorial/assets/bootstrap.css", location = AssetLocation.CLASSPATH)
		)package examples.tutorial.bookstore;

import juzu.Application;
import juzu.plugin.portlet.Portlet;
import juzu.plugin.asset.Script;

import juzu.plugin.binding.Bindings;
import juzu.plugin.binding.Binding;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Stylesheet;

