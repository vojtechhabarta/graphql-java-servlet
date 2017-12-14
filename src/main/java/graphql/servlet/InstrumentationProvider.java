package graphql.servlet;

import graphql.execution.instrumentation.Instrumentation;

public interface InstrumentationProvider {
    Instrumentation getInstrumentation();
    default Instrumentation getInstrumentation(GraphQLContext context) {
        return getInstrumentation();
    }
}
