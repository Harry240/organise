package org.nobel.highriseapi.resources.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.nobel.highriseapi.entities.EntityList;
import org.nobel.highriseapi.entities.base.Entity;

public abstract class EntityAccessorWithCacheSupport<T extends Entity> {

    private final boolean useCache;
    Map<Integer, Entity> cache;

    public EntityAccessorWithCacheSupport(Map<Integer, Entity> cache, boolean useCache) {
        this.cache = cache;
        this.useCache = useCache;
    }

    public T createEntity(T entity) {
        T createdEntity = delegateCreateEntity(entity);
        if (useCache) {
            cache.put(createdEntity.getId(), createdEntity);
        }
        return entity;
    }

    @SuppressWarnings("unchecked")
    public T getEntity(int id) {

        if (useCache && cache.containsKey(id)) {
            return (T) cache.get(id);
        }
        else {
            T entity = delegateGetEntity(id);
            if (useCache) {
                cache.put(id, entity);
            }
            return entity;
        }

    }

    @SuppressWarnings("unchecked")
    public List<T> getEntityList() {
        if (useCache && !cache.isEmpty()) {
            return new ArrayList<T>((Collection<? extends T>) cache.values());
        }
        else {
            EntityList<T> entityList = delegateGetAllEntities();
            for (T entity : entityList.getEntities()) {
                if (useCache) {
                    cache.put(((Entity) entity).getId(), entity);
                }
            }
            return entityList.getEntities();
        }
    }

    protected abstract T delegateCreateEntity(T entity);

    protected abstract EntityList<T> delegateGetAllEntities();

    protected abstract T delegateGetEntity(int id);
}
