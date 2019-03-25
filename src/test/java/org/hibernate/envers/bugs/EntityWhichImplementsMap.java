package org.hibernate.envers.bugs;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

/**
 * Note that if you remove @Audited, the provided test works.
 */
@Audited
@Entity
public class EntityWhichImplementsMap implements Map<String, String> {

   public EntityWhichImplementsMap(String mapData) {
      this.mapData = mapData;
   }

   public EntityWhichImplementsMap() {
   }

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String mapData;

   @Override
   public int size() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean isEmpty() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean containsKey(Object key) {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean containsValue(Object value) {
      throw new UnsupportedOperationException();
   }

   @Override
   public String get(Object key) {
      System.out.println("Trying to get key: " + key);
      return null;
   }

   @Override
   public String put(String key, String value) {
      throw new UnsupportedOperationException();
   }

   @Override
   public String remove(Object key) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void putAll(Map<? extends String, ? extends String> m) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Set<String> keySet() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Collection<String> values() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Set<Entry<String, String>> entrySet() {
      throw new UnsupportedOperationException();
   }
}
