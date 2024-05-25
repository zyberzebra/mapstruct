/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.emptytarget;

import org.mapstruct.ap.testutil.ProcessorTest;
import org.mapstruct.ap.testutil.WithClasses;
import org.mapstruct.ap.testutil.compilation.annotation.CompilationResult;
import org.mapstruct.ap.testutil.compilation.annotation.Diagnostic;
import org.mapstruct.ap.testutil.compilation.annotation.ExpectedCompilationOutcome;


class JarMapperTest {

    @ProcessorTest
    @ExpectedCompilationOutcome(value = CompilationResult.SUCCEEDED,
        diagnostics = {
            @Diagnostic(type = JarToJarMapper.class,
                kind = javax.tools.Diagnostic.Kind.WARNING,
                message = "Target \"EmptyJar\" has no target properties, targeted by this mapping method: \"EmptyJar mapToEmptyJar(FilledJar filledJar)\"")
        })
    @WithClasses({ FilledJar.class, EmptyJar.class, JarToJarMapper.class })
    void targetHasNoProperties() {
    }


    @ProcessorTest
    @ExpectedCompilationOutcome(value = CompilationResult.SUCCEEDED,
        diagnostics = {
            @Diagnostic(type = JarToAirplaneMapper.class,
                kind = javax.tools.Diagnostic.Kind.WARNING,
                message = "Target \"AirplaneWithNoAccessors\" has no target properties, targeted by this mapping method: \"AirplaneWithNoAccessors mapToAirplaneWithNoAccessors(FilledJar jar)\"")
        })
    @WithClasses({ FilledJar.class, AirplaneWithNoAccessors.class, JarToAirplaneMapper.class })
    void targetHasNoAccessibleProperties() {
    }
}