package aspects;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@EnableLoadTimeWeaving(aspectjWeaving = EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableSpringConfigured
@ComponentScan(basePackages = {"aspects", "io.swagger.model" })
public class AspectConfig {
    @Bean
    public TableAspect myTableAspect() {
        return Aspects.aspectOf(TableAspect.class);
    }
}
