/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import java.util.*;
import caju.analysis.*;

@SuppressWarnings("nls")
public final class AListaAtrib extends PListaAtrib
{
    private PAtrib _atrib_;
    private final LinkedList<PAtribEstrela> _atribEstrela_ = new LinkedList<PAtribEstrela>();

    public AListaAtrib()
    {
        // Constructor
    }

    public AListaAtrib(
        @SuppressWarnings("hiding") PAtrib _atrib_,
        @SuppressWarnings("hiding") List<?> _atribEstrela_)
    {
        // Constructor
        setAtrib(_atrib_);

        setAtribEstrela(_atribEstrela_);

    }

    @Override
    public Object clone()
    {
        return new AListaAtrib(
            cloneNode(this._atrib_),
            cloneList(this._atribEstrela_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaAtrib(this);
    }

    public PAtrib getAtrib()
    {
        return this._atrib_;
    }

    public void setAtrib(PAtrib node)
    {
        if(this._atrib_ != null)
        {
            this._atrib_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atrib_ = node;
    }

    public LinkedList<PAtribEstrela> getAtribEstrela()
    {
        return this._atribEstrela_;
    }

    public void setAtribEstrela(List<?> list)
    {
        for(PAtribEstrela e : this._atribEstrela_)
        {
            e.parent(null);
        }
        this._atribEstrela_.clear();

        for(Object obj_e : list)
        {
            PAtribEstrela e = (PAtribEstrela) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._atribEstrela_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atrib_)
            + toString(this._atribEstrela_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atrib_ == child)
        {
            this._atrib_ = null;
            return;
        }

        if(this._atribEstrela_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atrib_ == oldChild)
        {
            setAtrib((PAtrib) newChild);
            return;
        }

        for(ListIterator<PAtribEstrela> i = this._atribEstrela_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAtribEstrela) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
