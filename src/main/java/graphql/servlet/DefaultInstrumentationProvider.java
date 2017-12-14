package graphql.servlet;

import graphql.execution.instrumentation.Instrumentation;

public class DefaultInstrumentationProvider implements InstrumentationProvider {

    private final Instrumentation instrumentation;

    public DefaultInstrumentationProvider() {
        this(null);
    }

    public DefaultInstrumentationProvider(Instrumentation instrumentation) {
        this.instrumentation = instrumentation;
    }

    @Override
    public Instrumentation getInstrumentation() {
        return instrumentation;
    }

    @Override
    public Instrumentation getInstrumentation(GraphQLContext context) {
        return getInstrumentation();
    }
}
