package com.luxoft.sqa.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;

public class Groups extends ForwardingSet<GroupData> {

        private Set<GroupData> delegate;

        public Groups() {
            this.delegate = new HashSet<GroupData>();
        }

        @Override
        protected Set<GroupData> delegate() { //обертка класса, делегирование
            return delegate;
        }

        public Groups(Groups groups){//сам конструктор
            this.delegate = new HashSet<>(groups.delegate);//новый множество для delegate
        }



        public Groups withAdded(GroupData group){
            Groups groups = new Groups(this);  //создание копии объекта, новый конструктор со ссылкой на себя
            groups.add(group);
            return groups;


        }

        public Groups without(GroupData group){
            Groups groups = new Groups(this);  //создание копии объекта, новый конструктор со ссылкой на себя
            groups.remove(group);
            return groups;


    }
}
