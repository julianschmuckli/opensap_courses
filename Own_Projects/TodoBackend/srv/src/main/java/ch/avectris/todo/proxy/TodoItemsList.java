//# xsc 19.6.0-a27f20-20190621

package ch.avectris.todo.proxy;

public class TodoItemsList
    extends com.sap.cloud.server.odata.ListBase
    implements java.lang.Iterable<ch.avectris.todo.proxy.TodoItems>
{
    public static final ch.avectris.todo.proxy.TodoItemsList empty = new ch.avectris.todo.proxy.TodoItemsList(java.lang.Integer.MIN_VALUE);

    public TodoItemsList()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        this(4);
    }

    public TodoItemsList(final int capacity)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:13:5
        super(capacity);
    }

    public void add(final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:50:5
        this.getUntypedList().add(this.validate(((Object)item)));
    }

    public void addAll(final ch.avectris.todo.proxy.TodoItemsList list)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:59:5
        this.getUntypedList().addAll(list.getUntypedList());
    }

    public ch.avectris.todo.proxy.TodoItemsList addThis(final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:70:5
        this.add(item);
        return this;
    }

    public ch.avectris.todo.proxy.TodoItemsList copy()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:78:5
        return this.slice(0);
    }

    public ch.avectris.todo.proxy.TodoItems first()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:86:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getUntypedList().first());
    }

    public static ch.avectris.todo.proxy.TodoItemsList from(final java.util.List<ch.avectris.todo.proxy.TodoItems> list)
    {
        return TodoItemsList.share(new com.sap.cloud.server.odata.core.GenericList<ch.avectris.todo.proxy.TodoItems>(list).toAnyList());
    }

    public ch.avectris.todo.proxy.TodoItems get(final int index)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:96:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getUntypedList().get(index));
    }

    public boolean includes(final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:104:5
        return this.indexOf(item) != -1;
    }

    public int indexOf(final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.indexOf(item, 0);
    }

    public int indexOf(final ch.avectris.todo.proxy.TodoItems item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:113:5
        return this.getUntypedList().indexOf(((Object)item), start);
    }

    public void insertAll(final int index, final ch.avectris.todo.proxy.TodoItemsList list)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:135:5
        this.getUntypedList().insertAll(index, list.getUntypedList());
    }

    public void insertAt(final int index, final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:124:5
        this.getUntypedList().insertAt(index, ((Object)item));
    }

    public java.util.Iterator<ch.avectris.todo.proxy.TodoItems> iterator()
    {
        return this.toGeneric().iterator();
    }

    public ch.avectris.todo.proxy.TodoItems last()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:143:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getUntypedList().last());
    }

    public int lastIndexOf(final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.lastIndexOf(item, 2147483647);
    }

    public int lastIndexOf(final ch.avectris.todo.proxy.TodoItems item, final int start)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:152:5
        return this.getUntypedList().lastIndexOf(((Object)item), start);
    }

    public void set(final int index, final ch.avectris.todo.proxy.TodoItems item)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:162:5
        this.getUntypedList().set(index, ((Object)item));
    }

    public static ch.avectris.todo.proxy.TodoItemsList share(final com.sap.cloud.server.odata.ListBase list)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:24:12
        final com.sap.cloud.server.odata.core.UntypedList items = list.getUntypedList();
        final int n = items.length();
        final ch.avectris.todo.proxy.TodoItemsList result = new ch.avectris.todo.proxy.TodoItemsList(n);
        boolean replace = false;
        {
            int i = 0;
            for (; (i < n); i++)
            {
                final Object item = items.get(i);
                if (item instanceof ch.avectris.todo.proxy.TodoItems)
                {
                    final ch.avectris.todo.proxy.TodoItems var_item = ((ch.avectris.todo.proxy.TodoItems)item);
                    result.add(var_item);
                }
                else
                {
                    replace = true;
                }
            }
        }
        result.shareWith(list, replace);
        return result;
    }

    public ch.avectris.todo.proxy.TodoItems single()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:171:5
        return ch.avectris.todo.proxy.internal.Any_as_ch_avectris_todo_proxy_TodoItems.cast(this.getUntypedList().single());
    }

    public ch.avectris.todo.proxy.TodoItemsList slice(final int start)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        return this.slice(start, 2147483647);
    }

    public ch.avectris.todo.proxy.TodoItemsList slice(final int start, final int end)
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:357:37 => /usr/sap/ljs/xs-temp/xs-home/templates/List.xs:180:5
        final com.sap.cloud.server.odata.core.UntypedList list = this.getUntypedList();
        final int var_start = list.startRange(start);
        final int var_end = list.endRange(end);
        final ch.avectris.todo.proxy.TodoItemsList result = new ch.avectris.todo.proxy.TodoItemsList(var_end - var_start);
        result.getUntypedList().addRange(list, var_start, var_end);
        return result;
    }

    @java.lang.Override public com.sap.cloud.server.odata.ListBase toDynamic()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:359:5
        return this.toEntityList();
    }

    public com.sap.cloud.server.odata.EntityValueList toEntityList()
    {
        //# /usr/sap/ljs/xs-temp/bf3f8ea4-ff32-4d0c-aff1-8c3d89f8c823/output/target/tmp/proxy-ch.avectris.todo.csdl.xs:364:5
        return com.sap.cloud.server.odata.EntityValueList.share(this).withItemType(ch.avectris.todo.proxy.TodoServiceMetadata.EntityTypes.todoItems);
    }

    public java.util.List<ch.avectris.todo.proxy.TodoItems> toGeneric()
    {
        return new com.sap.cloud.server.odata.core.GenericList<ch.avectris.todo.proxy.TodoItems>(this);
    }
}
