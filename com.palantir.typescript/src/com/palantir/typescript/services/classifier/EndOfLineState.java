/*
 * Copyright 2013 Palantir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palantir.typescript.services.classifier;

/**
 * Corresponds to the enum with the same name in classifier.ts.
 *
 * @author dcicerone
 */
public enum EndOfLineState {
    NONE,
    IN_MULTI_LINE_COMMENT_TRIVIA,
    IN_SINGLE_QUOTE_STRING_LITERAL,
    IN_DOUBLE_QUOTE_STRING_LITERAL,
    IN_TEMPLATE_HEAD_OR_NO_SUBSTITUTION_TEMPLATE,
    IN_TEMPLATE_MIDDLE_OR_TAIL,
    IN_TEMPLATE_SUBSTITUTION_POSITION
}
