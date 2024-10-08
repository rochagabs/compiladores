/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ANumeroPalavraTipoBase extends PTipoBase
{
    private TNumeroPalavra _numeroPalavra_;

    public ANumeroPalavraTipoBase()
    {
        // Constructor
    }

    public ANumeroPalavraTipoBase(
        @SuppressWarnings("hiding") TNumeroPalavra _numeroPalavra_)
    {
        // Constructor
        setNumeroPalavra(_numeroPalavra_);

    }

    @Override
    public Object clone()
    {
        return new ANumeroPalavraTipoBase(
            cloneNode(this._numeroPalavra_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumeroPalavraTipoBase(this);
    }

    public TNumeroPalavra getNumeroPalavra()
    {
        return this._numeroPalavra_;
    }

    public void setNumeroPalavra(TNumeroPalavra node)
    {
        if(this._numeroPalavra_ != null)
        {
            this._numeroPalavra_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroPalavra_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroPalavra_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroPalavra_ == child)
        {
            this._numeroPalavra_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroPalavra_ == oldChild)
        {
            setNumeroPalavra((TNumeroPalavra) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
