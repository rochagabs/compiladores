/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ADecVariavel extends PDecVariavel
{
    private PTipo _tipo_;
    private PListaNomes _listaNomes_;
    private TPonto _ponto_;

    public ADecVariavel()
    {
        // Constructor
    }

    public ADecVariavel(
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") PListaNomes _listaNomes_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setTipo(_tipo_);

        setListaNomes(_listaNomes_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new ADecVariavel(
            cloneNode(this._tipo_),
            cloneNode(this._listaNomes_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecVariavel(this);
    }

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
    }

    public PListaNomes getListaNomes()
    {
        return this._listaNomes_;
    }

    public void setListaNomes(PListaNomes node)
    {
        if(this._listaNomes_ != null)
        {
            this._listaNomes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaNomes_ = node;
    }

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipo_)
            + toString(this._listaNomes_)
            + toString(this._ponto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipo_ == child)
        {
            this._tipo_ = null;
            return;
        }

        if(this._listaNomes_ == child)
        {
            this._listaNomes_ = null;
            return;
        }

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
            return;
        }

        if(this._listaNomes_ == oldChild)
        {
            setListaNomes((PListaNomes) newChild);
            return;
        }

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
