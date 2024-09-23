/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import java.util.*;
import caju.analysis.*;

@SuppressWarnings("nls")
public final class AVariosParametrosParametros extends PParametros
{
    private PParametro _parametro_;
    private final LinkedList<PParametroEstrela> _parametroEstrela_ = new LinkedList<PParametroEstrela>();

    public AVariosParametrosParametros()
    {
        // Constructor
    }

    public AVariosParametrosParametros(
        @SuppressWarnings("hiding") PParametro _parametro_,
        @SuppressWarnings("hiding") List<?> _parametroEstrela_)
    {
        // Constructor
        setParametro(_parametro_);

        setParametroEstrela(_parametroEstrela_);

    }

    @Override
    public Object clone()
    {
        return new AVariosParametrosParametros(
            cloneNode(this._parametro_),
            cloneList(this._parametroEstrela_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariosParametrosParametros(this);
    }

    public PParametro getParametro()
    {
        return this._parametro_;
    }

    public void setParametro(PParametro node)
    {
        if(this._parametro_ != null)
        {
            this._parametro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametro_ = node;
    }

    public LinkedList<PParametroEstrela> getParametroEstrela()
    {
        return this._parametroEstrela_;
    }

    public void setParametroEstrela(List<?> list)
    {
        for(PParametroEstrela e : this._parametroEstrela_)
        {
            e.parent(null);
        }
        this._parametroEstrela_.clear();

        for(Object obj_e : list)
        {
            PParametroEstrela e = (PParametroEstrela) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._parametroEstrela_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parametro_)
            + toString(this._parametroEstrela_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parametro_ == child)
        {
            this._parametro_ = null;
            return;
        }

        if(this._parametroEstrela_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parametro_ == oldChild)
        {
            setParametro((PParametro) newChild);
            return;
        }

        for(ListIterator<PParametroEstrela> i = this._parametroEstrela_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametroEstrela) newChild);
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
