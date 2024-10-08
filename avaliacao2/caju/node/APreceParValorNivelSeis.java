/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class APreceParValorNivelSeis extends PNivelSeis
{
    private PPreceParValor _preceParValor_;

    public APreceParValorNivelSeis()
    {
        // Constructor
    }

    public APreceParValorNivelSeis(
        @SuppressWarnings("hiding") PPreceParValor _preceParValor_)
    {
        // Constructor
        setPreceParValor(_preceParValor_);

    }

    @Override
    public Object clone()
    {
        return new APreceParValorNivelSeis(
            cloneNode(this._preceParValor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPreceParValorNivelSeis(this);
    }

    public PPreceParValor getPreceParValor()
    {
        return this._preceParValor_;
    }

    public void setPreceParValor(PPreceParValor node)
    {
        if(this._preceParValor_ != null)
        {
            this._preceParValor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._preceParValor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._preceParValor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._preceParValor_ == child)
        {
            this._preceParValor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._preceParValor_ == oldChild)
        {
            setPreceParValor((PPreceParValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
