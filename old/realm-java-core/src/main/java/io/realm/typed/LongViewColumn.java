/*
 * Copyright 2014 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.realm.typed;

import io.realm.TableOrView;
//import TableQuery;
import io.realm.TableView;
import io.realm.TableView.Order;

/**
 * Type of the fields that represent a long column in the generated XyzView
 * class for the Xyz entity.
 */
public class LongViewColumn<Cursor, View, Query> extends LongTableOrViewColumn<Cursor, View, Query> {

    public LongViewColumn(EntityTypes<?, View, Cursor, Query> types, TableOrView view, int index, String name) {
        super(types, view, index, name);
    }

    /*public LongViewColumn(EntityTypes<?, View, Cursor, Query> types, TableOrView view, TableQuery query, int index,
            String name) {
        super(types, view, query, index, name);
    }*/

    public void sort(Order order) {
        ( (TableView) this.tableOrView).sort(this.columnIndex, order);
    }

    public void sort() {
        ( (TableView) this.tableOrView).sort(this.columnIndex);
    }
}