/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AOutraComandoCasam extends PComandoCasam
{
    private POutra _outra_;

    public AOutraComandoCasam()
    {
        // Constructor
    }

    public AOutraComandoCasam(
        @SuppressWarnings("hiding") POutra _outra_)
    {
        // Constructor
        setOutra(_outra_);

    }

    @Override
    public Object clone()
    {
        return new AOutraComandoCasam(
            cloneNode(this._outra_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOutraComandoCasam(this);
    }

    public POutra getOutra()
    {
        return this._outra_;
    }

    public void setOutra(POutra node)
    {
        if(this._outra_ != null)
        {
            this._outra_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._outra_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._outra_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._outra_ == child)
        {
            this._outra_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._outra_ == oldChild)
        {
            setOutra((POutra) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
