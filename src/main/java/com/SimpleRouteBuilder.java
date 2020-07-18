package com;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:/Users/gwenm/mike/inputFiles?noop=true").to("file:C:/Users/gwenm/mike/outputFiles");
    }

}
