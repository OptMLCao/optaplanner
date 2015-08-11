/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.domain.variable.listener;

public class VariableListenerNotifiable implements Comparable<VariableListenerNotifiable> {

    protected final VariableListener variableListener;
    protected final int globalOrder;

    public VariableListenerNotifiable(VariableListener variableListener, int globalOrder) {
        this.variableListener = variableListener;
        this.globalOrder = globalOrder;
    }

    public VariableListener getVariableListener() {
        return variableListener;
    }

    public int getGlobalOrder() {
        return globalOrder;
    }

    @Override
    public int compareTo(VariableListenerNotifiable other) {
        int otherGlobalOrder = other.getGlobalOrder();
        if (globalOrder < otherGlobalOrder) {
            return 1;
        } else if (globalOrder > otherGlobalOrder) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "(" + globalOrder + ") " + variableListener;
    }

}